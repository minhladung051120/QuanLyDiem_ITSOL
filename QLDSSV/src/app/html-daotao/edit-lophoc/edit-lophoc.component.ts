import { Component, OnInit } from '@angular/core';
import { ServicesService } from '../../services.service';
import { ActivatedRoute, Router } from '@angular/router';
import { lopHoc } from '../../model/lopHoc';
import { monHoc } from 'src/app/model/monHoc';
import { GiangVien } from 'src/app/model/giangvien';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
@Component({
  selector: 'app-edit-lophoc',
  templateUrl: './edit-lophoc.component.html',
  styleUrls: ['./edit-lophoc.component.css']
})
export class EditLophocComponent implements OnInit {
  lophoc: lopHoc;
  private baseUrl = 'http://localhost:8080/';


  monhoc: monHoc[];
  giangvien: GiangVien[];
  gvSelected: any = {};
  mhSelected: any = {};
  constructor(
    private servicesService: ServicesService,
    private activate: ActivatedRoute,
    private router: Router,
    private http:HttpClient
  ) {}

  ngOnInit(): void {
    this.getLopHocId();
    this.upData()
  }

  getAllMonHoc(): Observable<monHoc[]>{
    return this.http.get<monHoc[]>(this.baseUrl+"getMonHoc2");
  }
  getAllGiangVien(): Observable<GiangVien[]>{
    return this.http.get<GiangVien[]>(this.baseUrl+"getGiangVien2");
  }
  upData(){
    this.getAllMonHoc().subscribe(data => {
       this.monhoc = data
       })
   
    this.getAllGiangVien().subscribe(data => { this.giangvien = data })
  }
  onGvSelected(val: GiangVien){
    this.gvSelected = val;
  }
  onMhSelected(val: monHoc){
    this.mhSelected = val;
    console.log(val.maMon)
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
    const id = this.activate.snapshot.params.id
    this.lophoc.maMonHoc = this.mhSelected;
    this.lophoc.giangvien = this.gvSelected;
    console.log(this.lophoc)
    this.servicesService.updateLopHoc(id,this.lophoc).subscribe(
      (data) => {  
        console.log(data);   
        this.router.navigate(['/daotao/daotao-qllh']);
       },
       err => {
        console.log(err)
       },
    )
  }

  // gotoList() {
  //   this.router.navigate(['/daotao/daotao-qllh']);
  // }

}
