import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { HomeComponent } from './home/home.component';
import { DaotaoQLTKComponent } from './html-daotao/daotao-qltk/daotao-qltk.component';
import { DaotaobangtinComponent } from './html-daotao/daotaobangtin/daotaobangtin.component';
import { DaotaothemtkComponent } from './html-daotao/daotaothemtk/daotaothemtk.component';
import { DaotaothemtkgvComponent } from './html-daotao/daotaothemtkgv/daotaothemtkgv.component';
import { DaotaoComponent } from './html-daotao/daotao/daotao.component';
import { DaotaoQlkyhocComponent } from './html-daotao/daotao-qlkyhoc/daotao-qlkyhoc.component';
import { DaotaothemkyhocComponent } from './html-daotao/daotaothemkyhoc/daotaothemkyhoc.component';
import { DaotaoQlmhComponent } from './html-daotao/daotao-qlmh/daotao-qlmh.component';
import { DaotaothemmonhocComponent } from './html-daotao/daotaothemmonhoc/daotaothemmonhoc.component';
import { DaotaoQllhComponent } from './html-daotao/daotao-qllh/daotao-qllh.component';
import { DaotaothemlophocComponent } from './html-daotao/daotaothemlophoc/daotaothemlophoc.component';
import { EditLophocComponent } from './html-daotao/edit-lophoc/edit-lophoc.component';
import { DaotaoQldiemComponent } from './html-daotao/daotao-qldiem/daotao-qldiem.component';
import { GiangvienComponent } from './html-giangvien/giangvien/giangvien.component';
import { GiangvienMonhocComponent } from './html-giangvien/giangvien-monhoc/giangvien-monhoc.component';
import { GiangvienLophocComponent } from './html-giangvien/giangvien-lophoc/giangvien-lophoc.component';
import { GiangvienDiemComponent } from './html-giangvien/giangvien-diem/giangvien-diem.component';
import { SinhvienComponent } from './html-sinhvien/sinhvien/sinhvien.component';
import { SinhvienBangdiemComponent } from './html-sinhvien/sinhvien-bangdiem/sinhvien-bangdiem.component';
import { SinhvienLichhocComponent } from './html-sinhvien/sinhvien-lichhoc/sinhvien-lichhoc.component';
import { DanhsachSVComponent } from './html-daotao/danhsach-sv/danhsach-sv.component';
import { EditDiemComponent } from './html-daotao/edit-diem/edit-diem.component';
import { EditKyhocComponent } from './html-daotao/edit-kyhoc/edit-kyhoc.component';
import { EditMonhocComponent } from './html-daotao/edit-monhoc/edit-monhoc.component';
import { EditTaikhoanComponent } from './html-daotao/edit-taikhoan/edit-taikhoan.component';
import { DaotaothemtksvComponent } from './html-daotao/daotaothemtksv/daotaothemtksv.component';
import { EditTaikhoanGVComponent } from './html-daotao/edit-taikhoan-gv/edit-taikhoan-gv.component';
import { EditTaikhoanSVComponent } from './html-daotao/edit-taikhoan-sv/edit-taikhoan-sv.component';



const routes: Routes = [
  {path :"", redirectTo :"home" ,pathMatch:"full"},
  {path :"home" ,component : HomeComponent},
  {path :"login" ,component : LoginComponent},
  {path :"daotao" ,component : DaotaoComponent,
  children : [
    {path :"", redirectTo :"bangtin" ,pathMatch:"full"},
    {path :"bangtin" ,component : DaotaobangtinComponent},
    {path :"daotao-qltk" ,component : DaotaoQLTKComponent},
    {path :"daotaothemtk" ,component : DaotaothemtkComponent},
    {path :"daotaothemtksv" ,component : DaotaothemtksvComponent},
    {path :"daotaothemtkgv" ,component : DaotaothemtkgvComponent},
    {path :"daotao-qlkyhoc" ,component : DaotaoQlkyhocComponent},
    {path :"daotaothemkyhoc" ,component : DaotaothemkyhocComponent},
    {path :"daotao-qlmh" ,component : DaotaoQlmhComponent},
    {path :"daotaothemmonhoc" ,component : DaotaothemmonhocComponent},
    {path :"daotao-qllh" ,component : DaotaoQllhComponent},
    {path :"daotaothemlophoc" ,component : DaotaothemlophocComponent},
    {path :"daotao-qldiem" ,component : DaotaoQldiemComponent},
    {path :"danhsach-sv" ,component : DanhsachSVComponent},
    {path :"edit-diem" ,component : EditDiemComponent},
    {path :"edit-lophoc/:id" ,component : EditLophocComponent},
    {path :"edit-kyhoc/:id" ,component : EditKyhocComponent},
    {path :"edit-monhoc/:id" ,component : EditMonhocComponent},
    {path :"edit-taikhoan/DT/:id" ,component : EditTaikhoanComponent},
    {path :"edit-taikhoan/GV/:id" ,component : EditTaikhoanGVComponent},
    {path :"edit-taikhoan/SV/:id" ,component : EditTaikhoanSVComponent},


  ]},
  {path :"giangvien" ,component : GiangvienComponent,
  children : [
    {path :"", redirectTo :"giangvien-monhoc" ,pathMatch:"full"},
    {path :"giangvien-monhoc" ,component : GiangvienMonhocComponent},
    {path :"giangvien-lophoc" ,component : GiangvienLophocComponent},
    {path :"giangvien-diem/:id" ,component : GiangvienDiemComponent},
    ]},
  {path :"sinhvien" , component :SinhvienComponent,
    children : [
      {path :"", redirectTo :"sinhvien-lichhoc" ,pathMatch:"full"},
      {path :"sinhvien-lichhoc" ,component : SinhvienLichhocComponent},
      {path :"sinhvien-bangdiem/:id" ,component : SinhvienBangdiemComponent}
    ]}
  ]
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
