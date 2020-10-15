import { Component, OnInit } from '@angular/core';
import { ServicesService } from '../../services.service';
import { Router } from '@angular/router';
import { getMonHoc } from '../../model/getMonHoc';
@Component({
  selector: 'app-daotao-qlmh',
  templateUrl: './daotao-qlmh.component.html',
  styleUrls: ['./daotao-qlmh.component.css'],
})
export class DaotaoQlmhComponent implements OnInit {
  monhocs: getMonHoc[];
  page = 1;
  pageSize = 5;
  searchText="";
  p : Number=1;
  constructor(
    private servicesService: ServicesService,
    private router: Router
  ) {}

  ngOnInit(): void {
    this.monHoc();
  }
  monHoc() {
    this.servicesService.getMonHoc().subscribe((data: any[]) => {
      this.monhocs = data;
    });
  }
  deleteMonHoc(maMon) {
    this.servicesService.deleteMonHoc(maMon).subscribe(response =>
     {this.monhocs = this.monhocs.filter(monhoc => monhoc.maMon != maMon);
 })
}
search(id){
  this.servicesService.searchMonHoc(id).subscribe((data: any[]) => {
    console.log(data);
    this.monhocs = data;
  });
}
clickMethod(name: string) {
  if(confirm("Bạn chắc chắn muốn xóa? "+name)) {
      this.deleteMonHoc(name);
  }
}
}
