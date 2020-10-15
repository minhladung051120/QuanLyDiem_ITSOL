import { Component, OnInit } from '@angular/core';
import { ServicesService } from '../../services.service';
import { Router } from '@angular/router';
import { getLopHoc } from '../../model/getLopHoc';
import * as fileSaver from 'file-saver';
import { lopHoc } from 'src/app/model/lopHoc';

@Component({
  selector: 'app-daotao-qllh',
  templateUrl: './daotao-qllh.component.html',
  styleUrls: ['./daotao-qllh.component.css'],
})
export class DaotaoQllhComponent implements OnInit {
  date : Date;
  lophocs: getLopHoc[];
  lophoc: lopHoc;
  page = 1;
  pageSize = 5;
  searchText;
  p : Number=1;
  constructor(
    private servicesService: ServicesService,
    private router: Router
  ) {}

  ngOnInit(): void {
    this.lopHoc();
  }
  lopHoc() {
    this.servicesService.getLopHoc().subscribe((data: any[]) => {
      this.lophocs = data;
    });
  }
  clickMethod(name: string) {
    if(confirm("Bạn chắc chắn muốn xóa? "+name)) {
        this.deleteLopHoc(name);
    }
  }
  getLopHocId(malop) {
    this.servicesService.getLopHocId(malop).subscribe((data) => {
      console.log(data);
      this.lophoc = data;
    });
  }
  deleteLopHoc(maLop) {
   this.getLopHocId(maLop)
    this.servicesService.deleteLopHoc(maLop,this.lophoc).subscribe(
      data => {     
        this.router.navigate(['/daotao/daotao-qllh']);
       },
       err => {
        console.log(err)
       },
    )
}
exportExcel(){
  this.servicesService.exportExcel1(this.date).subscribe(
    response => {
      let blob:any = new Blob([response], { type: 'text/json; charset=utf-8' });
      const url = window.URL.createObjectURL(blob);
      fileSaver.saveAs(blob, 'lophoc.xlsx');
    }
  ),error => console.log('Error downloading the file'),
  () => console.info('File downloaded su ccessfully');
}
}
