import { Component, OnInit } from '@angular/core';
import { lopHoc } from '../../model/lopHoc';
import { Router } from '@angular/router';
import { ServicesService } from '../../services.service';
import { FormGroup,  FormBuilder,  Validators ,FormControl } from '@angular/forms';
import { monHoc } from 'src/app/model/monHoc';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { GiangVien } from 'src/app/model/giangvien';

@Component({
  selector: 'app-daotaothemlophoc',
  templateUrl: './daotaothemlophoc.component.html',
  styleUrls: ['./daotaothemlophoc.component.css'],
})
export class DaotaothemlophocComponent implements OnInit {

private baseUrl = 'http://localhost:8080/';


  lophoc: lopHoc = new lopHoc();
  monhoc: monHoc[];
  giangvien: GiangVien[];
  gvSelected: any = {};
  mhSelected: any = {};


  constructor(
    private http:HttpClient,
    private servicesService: ServicesService,
    private router: Router
  ) {}

  ngOnInit(): void {
    this.getAllMonHoc()
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
  }
  save() {
    this.lophoc.giangvien = this.gvSelected;
    this.lophoc.maMonHoc = this.mhSelected;
    console.log(this.lophoc)
    this.servicesService.createLopHoc(this.lophoc).subscribe(
      (data) =>{
        this.gotoList(), console.log(data)
      } ,
      (error) => console.log(error),
      
    );
   
  }
  onSubmit() {
    this.save();
  }
  gotoList() {
    if (confirm("Thêm lớp học thành công")) {
      this.router.navigate(['/daotao/daotao-qllh']);
    }
  }
}
