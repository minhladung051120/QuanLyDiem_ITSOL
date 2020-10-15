import { Component, OnInit } from '@angular/core';
import { ServicesService } from '../../services.service';
import { ActivatedRoute, Router } from '@angular/router';
import { kyHoc } from '../../model/kyHoc';
@Component({
  selector: 'app-edit-kyhoc',
  templateUrl: './edit-kyhoc.component.html',
  styleUrls: ['./edit-kyhoc.component.css'],
})
export class EditKyhocComponent implements OnInit {
  kyhoc: kyHoc;
  constructor(
    private servicesService: ServicesService,
    private activate: ActivatedRoute,
    private router: Router
  ) { }

  ngOnInit(): void {
    this.getKyHocId();
  }

  getKyHocId() {
    this.activate.params.subscribe((param) => {
      this.servicesService.getKyHocId(param.id).subscribe((data) => {
        console.log(data);
        this.kyhoc = data;
      });
    });
  }

  save() {
    this.servicesService.updateKyHoc(this.kyhoc).subscribe(
      (data) => {
        console.log(data); 
        this.gotoList();
      },
      (error) => console.log(error),

    );
    this.kyhoc = new kyHoc();

  }

  gotoList() {
    this.router.navigate(['/daotao/daotao-qlkyhoc']);
  }
}
