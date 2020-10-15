import { Component, OnInit } from '@angular/core';
import { ServicesService } from '../../services.service';
import { Router } from '@angular/router';
import { getKyHoc } from '../../model/getKyHoc';
@Component({
  selector: 'app-daotao-qlkyhoc',
  templateUrl: './daotao-qlkyhoc.component.html',
  styleUrls: ['./daotao-qlkyhoc.component.css'],
})
export class DaotaoQlkyhocComponent implements OnInit {
  kyhocs: getKyHoc[];
  page = 1;
  pageSize = 5;
  searchText;
  p : Number=1;
  constructor(
    private servicesService: ServicesService,
    private router: Router
  ) {}

  ngOnInit(): void {
    this.kyHoc();
  }
  kyHoc() {
    this.servicesService.getKyHoc().subscribe((data: any[]) => {
      this.kyhocs = data;
    });
  }
  deleteKyHoc(maKy) {
    this.servicesService.deleteKyHoc(maKy).subscribe(response =>
     {this.kyhocs = this.kyhocs.filter(kyhoc => kyhoc.maKy != maKy);
 })
}

}
