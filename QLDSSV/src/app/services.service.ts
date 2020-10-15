import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { lopHoc } from './model/lopHoc';

@Injectable({
  providedIn: 'root'
})
export class ServicesService {
  private baseUrl = 'http://localhost:8080/';
  private sinhVienUrl = 'http://localhost:8080/api/sinhvien';
  private giangVienUrl = 'http://localhost:8080/api/giangvien';
  private daoTaoUrl = 'http://localhost:8080/api/daotao';
  
  constructor(
    private http: HttpClient
  ) { }
  getTaiKhoanSv(){
    return this.http.get(this.baseUrl+"getTaiKhoanSv");
  }

  getTaiKhoanGv(){
    return this.http.get(this.baseUrl+"getTaiKhoanGv");
  }

  getTaiKhoanDt(){
    return this.http.get(this.baseUrl+"getTaiKhoanDt");
  }

  getTaiKhoan(){
    return this.http.get(this.baseUrl+"getTaiKhoan");
  }

  getTaiKhoanId(maTk : number):Observable<any>{
    return this.http.get(this.baseUrl+"getTaiKhoan/"+maTk);
  }

  getTaiKhoanGvId(maTk : number):Observable<any>{
    return this.http.get(this.baseUrl+"getTaiKhoanGvId/"+maTk);
  }

  getTaiKhoanSvId(maTk : number):Observable<any>{
    return this.http.get(this.baseUrl+"getTaiKhoanSvId/"+maTk);
  }

  getKyHoc(){
    return this.http.get(this.baseUrl+"getKyHoc");
  }

  getKyHocId(maKy : number):Observable<any>{
    return this.http.get(this.baseUrl+"getKyHoc/"+maKy);
  }

  getLopHocId(maLop : string):Observable<any>{
    return this.http.get(this.baseUrl+`getLopHocId/${maLop}`);
  }

  getMonHoc(){
    return this.http.get(this.baseUrl+"getMonHoc");
  }

  getMonHocId(maMon : number):Observable<any>{
    return this.http.get(this.baseUrl+"getMonHoc/"+maMon);
  }


  getBangDiem(){
    return this.http.get(this.baseUrl+"getBangDiem");
  }

  getLopHoc(){
    return this.http.get(this.baseUrl+"getLopHocByAlive");
  }

  getSinhVien(){
    return this.http.get(this.baseUrl+"getSinhVien");
  }

  getMonHocByGv(){
    return this.http.get(this.baseUrl+"getMonHocByGv");
  }

  getLopHocBySv(){
    return this.http.get(this.baseUrl+"getLopHocBySv");
  }

  getSvByGv(maLop : number):Observable<any>{
    return this.http.get(this.baseUrl+"getSvByGv/"+maLop);
  }

  createKyHoc(kyHoc: Object): Observable<Object>{
    return this.http.post(this.baseUrl+"kyHoc",kyHoc);
  }

  createMonHoc(monHoc: Object): Observable<Object>{
    return this.http.post(this.baseUrl+"monHoc",monHoc);
  }

  createLopHoc(lopHoc: Object): Observable<Object>{
    return this.http.post(this.baseUrl+"lopHoc",lopHoc);
  }

  createTaiKhoanDt(taiKhoan: Object): Observable<Object>{
    return this.http.post(this.baseUrl+"createTaiKhoanDt",taiKhoan);
  }

  createTaiKhoanDb(taiKhoan: Object): Observable<Object>{
    return this.http.post(this.baseUrl+"createTaiKhoanDb",taiKhoan);
  }

  joinSinhVien(joinSinhVien: Object): Observable<Object>{
    return this.http.post(this.baseUrl+"joinSinhVien",joinSinhVien);
  }

  deleteKyHoc(maKy : number):Observable<any>{
    return this.http.delete(this.baseUrl+"kyHoc/"+maKy);
  }

  deleteTaiKhoanDt(maTk : number):Observable<any>{
    return this.http.delete(this.baseUrl+"deleteTaiKhoanDt/"+maTk);
  }

  deleteMonHoc(monHoc : number):Observable<any>{
    return this.http.delete(this.baseUrl+"monHoc/"+monHoc);
  }


  public deleteLopHoc(maLop:string, lopHoc: lopHoc): Observable<any>{
    return this.http.put<any>(this.baseUrl + `updateAlive/${maLop}`, lopHoc);
  }

  updateKyHoc(kyHoc: Object): Observable<Object>{
    return this.http.put(this.baseUrl+"updateKyHoc",kyHoc);
  }


  public updateLopHoc(id:string, lopHoc: lopHoc): Observable<any>{
    return this.http.put<any>(this.baseUrl + `updateLopHoc/${id}`, lopHoc);
  }

  searchKyHoc(tenKy : number){
    return this.http.get(this.baseUrl+"searchKyHoc/"+tenKy);
  }

  updateMonHoc(monHoc: Object): Observable<Object>{
    return this.http.put(this.baseUrl+"updateMonHoc",monHoc);
  }

  updateTaiKhoan(taiKhoan: Object): Observable<Object>{
    return this.http.put(this.baseUrl+"updateTaiKhoan",taiKhoan);
  }

  updateTaiKhoanDb(taiKhoan: Object): Observable<Object>{
    return this.http.put(this.baseUrl+"updateTaiKhoanDb",taiKhoan);
  }

  searchMonHoc(maMon: number){
    return this.http.get(this.baseUrl+"searchMonHoc/"+maMon);
  }
  getSVBoard(): Observable<string>{
    return this.http.get(this.sinhVienUrl, { responseType: 'text'});
  }

  getGVBoard(): Observable<string> {
    return this.http.get(this.giangVienUrl, { responseType: 'text' });
  }

  getDTBoard(): Observable<string> {
    return this.http.get(this.daoTaoUrl, { responseType: 'text'});
  }
  exportExcel2(date) : any{
    return this.http.get(this.baseUrl + `export/sinhvien?date=${date}`,{ responseType : 'blob'});
  }
  exportExcel1(date) : any{
    return this.http.get(this.baseUrl + `export/lophoc?date=${date}`,{ responseType : 'blob'});
  }
  exportExcel3(date) : any{
    return this.http.get(this.baseUrl + `export/bangdiem?date=${date}`,{ responseType : 'blob'});
  }
}
