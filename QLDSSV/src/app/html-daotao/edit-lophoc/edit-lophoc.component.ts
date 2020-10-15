import { Component, OnInit } from '@angular/core';
import { ServicesService } from '../../services.service';
import { ActivatedRoute, Router } from '@angular/router';
import { lopHoc } from '../../model/lopHoc';
@Component({
  selector: 'app-edit-lophoc',
  templateUrl: './edit-lophoc.component.html',
  styleUrls: ['./edit-lophoc.component.css']
})
export class EditLophocComponent implements OnInit {
  lophoc: lopHoc;
  constructor(
    private servicesService: ServicesService,
    private activate: ActivatedRoute,
    private router: Router
  ) {}

  ngOnInit(): void {
    this.getLopHocId();
  }

  getLopHocId() {
    this.activate.params.subscribe((param) => {
      this.servicesService.getLopHocId(param.id).subscribe((data) => {
        console.log(data);
        this.lophoc = data;
      });
    });
  }

  save() {
    this.servicesService.updateLopHoc(this.lophoc).subscribe(
      (data) => console.log(data),
      (error) => console.log(error),
    );
    this.lophoc = new lopHoc();
    this.gotoList();
  }

  gotoList() {
    this.router.navigate(['/daotao/daotao-qllh']);
  }

}
