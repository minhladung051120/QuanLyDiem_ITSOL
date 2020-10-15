import { Component, OnInit } from '@angular/core';
import { ServicesService } from '../../services.service';
import { ActivatedRoute, Router } from '@angular/router';
import { monHoc } from '../../model/monHoc';
@Component({
  selector: 'app-edit-monhoc',
  templateUrl: './edit-monhoc.component.html',
  styleUrls: ['./edit-monhoc.component.css']
})
export class EditMonhocComponent implements OnInit {
  monhoc: monHoc;
  constructor(private servicesService: ServicesService,
    private activate: ActivatedRoute,
    private router: Router) { }

  ngOnInit(): void {
    this.getMonHocId();
  }
  getMonHocId() {
    this.activate.params.subscribe((param) => {
      this.servicesService.getMonHocId(param.id).subscribe((data) => {
        console.log(data);
        this.monhoc = data;
      });
    });
  }

  save() {
    this.servicesService.updateMonHoc(this.monhoc).subscribe(
      (data) => console.log(data),
      (error) => console.log(error),
    );
    this.monhoc = new monHoc();
    this.gotoList();
  }

  gotoList() {
    this.router.navigate(['/daotao/daotao-qlmh']);
  }
}
