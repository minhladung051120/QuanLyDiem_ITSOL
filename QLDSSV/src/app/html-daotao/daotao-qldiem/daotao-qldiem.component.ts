import { Component, OnInit, ɵConsole } from '@angular/core';
import { ServicesService } from '../../services.service';
import { Router } from '@angular/router';
import { getBangDiem } from '../../model/getBangDiem';
import * as fileSaver from 'file-saver';
import * as XlSX from 'xlsx';

@Component({
  selector: 'app-daotao-qldiem',
  templateUrl: './daotao-qldiem.component.html',
  styleUrls: ['./daotao-qldiem.component.css'],
})

export class DaotaoQldiemComponent implements OnInit {
  date : Date;
  bangdiems: getBangDiem[];
  bangdiem: getBangDiem = new getBangDiem();
  page = 1;
  pageSize = 5;
  searchText;
  p : Number=1;
  data: [][];
  constructor(
    private servicesService: ServicesService,
    private router: Router
  ) {}

  ngOnInit(): void {
    this.bangDiem();
  }



  OnfileChange(evt : any){
    const target  : DataTransfer = <DataTransfer>(evt.target);
    if(target.files.length !== 1 ) throw new Error('Cannot use');
    const reader : FileReader = new FileReader();
    reader.onload = (e : any) => {
      const bstr : String = e.target.result ;
      const wb : XlSX.WorkBook = XlSX.read( bstr,{type : 'binary'});
      const wsname : string = wb.SheetNames[0];
      const ws : XlSX.WorkSheet = wb.Sheets[wsname];
      console.log(ws);
      this.data = (XlSX.utils.sheet_to_json(ws,{ header : 1}));
      this.data
      console.log(this.data);
      
    };
    reader.readAsBinaryString(target.files[0]);

  }

  bangDiem() {
    this.servicesService.getBangDiem().subscribe((data: any[]) => {
      this.bangdiems = data;
    });
  }
  exportExcel(){
    this.servicesService.exportExcel3(this.date).subscribe(
      response => {
        let blob:any = new Blob([response], { type: 'text/json; charset=utf-8' });
        const url = window.URL.createObjectURL(blob);
        fileSaver.saveAs(blob, 'bangdiem.xlsx');
      }
    ),error => console.log('Error downloading the file'),
    () => console.info('File downloaded su ccessfully');
  }
}
