import { Component, OnInit } from '@angular/core';
import { ServicesService } from '../../services.service';
import { Router } from '@angular/router';
import { getBangDiem } from '../../model/getBangDiem';
import * as fileSaver from 'file-saver';
@Component({
  selector: 'app-daotao-qldiem',
  templateUrl: './daotao-qldiem.component.html',
  styleUrls: ['./daotao-qldiem.component.css'],
})
export class DaotaoQldiemComponent implements OnInit {
  date : Date;
  bangdiems: getBangDiem[];
  page = 1;
  pageSize = 5;
  searchText;
  p : Number=1;
  constructor(
    private servicesService: ServicesService,
    private router: Router
  ) {}

  ngOnInit(): void {
    this.bangDiem();
  }
  bangDiem() {
    this.servicesService.getBangDiem().subscribe((data: any[]) => {
      this.bangdiems = data;
    });
  }
  exportExcel(){
    this.servicesService.exportExcel3(this.date).subscribe(
      response => {
        let blob:any = new Blob([response], { type: 'text/json; charset=utf-8' });
        const url = window.URL.createObjectURL(blob);
        fileSaver.saveAs(blob, 'bangdiem.xlsx');
      }
    ),error => console.log('Error downloading the file'),
    () => console.info('File downloaded su ccessfully');
  }
}
