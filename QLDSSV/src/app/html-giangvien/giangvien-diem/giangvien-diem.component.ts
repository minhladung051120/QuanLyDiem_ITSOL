import { Component, OnInit } from '@angular/core';
import { ServicesService } from '../../services.service';
import { ActivatedRoute,Router } from '@angular/router';
import { getSvByGv } from '../../model/getSvByGv';
@Component({
  selector: 'app-giangvien-giangvien/giangvien-banner',
  templateUrl: './giangvien-diem.component.html',
  styleUrls: ['./giangvien-diem.component.css']
})
export class GiangvienDiemComponent implements OnInit {
  getSvByGvs: getSvByGv[];
  constructor( private servicesService: ServicesService,
    private activate: ActivatedRoute,
    private router: Router) { }

  ngOnInit(): void {
    this.svByGv();
  }

  svByGv() {
    this.activate.params.subscribe((param) => {
      this.servicesService.getSvByGv(param.id).subscribe((data) => {
        console.log(data);
        this.getSvByGvs = data;
      });
    });
  }

}
