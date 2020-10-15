import { Component, OnInit } from '@angular/core';
import { ServicesService } from '../../services.service';
import { Router } from '@angular/router';
import { getSinhVien } from '../../model/getSinhVien';
import * as fileSaver from 'file-saver';
@Component({
  selector: 'app-danhsach-sv',
  templateUrl: './danhsach-sv.component.html',
  styleUrls: ['./danhsach-sv.component.css'],
})
export class DanhsachSVComponent implements OnInit {
  date: Date;
  sinhviens: getSinhVien[];
  page = 1 ;
  pageSize = 5;
  searchText;
  p : Number=1;
  constructor(
    private servicesService: ServicesService,
    private router: Router
  ) {}

  ngOnInit(): void {
    this.sinhVien();
  }
  sinhVien() {
    this.servicesService.getSinhVien().subscribe((data: any[]) => {
      this.sinhviens = data;
    });
  }
  exportExcel(){
    this.servicesService.exportExcel2(this.date).subscribe(
      response => {
        let blob:any = new Blob([response], { type: 'text/json; charset=utf-8' });
        const url = window.URL.createObjectURL(blob);
        fileSaver.saveAs(blob, 'Sinhvien.xlsx');
      }
    ),error => console.log('Error downloading the file'),
    () => console.info('File downloaded su ccessfully');
  }
 
  
  
}
