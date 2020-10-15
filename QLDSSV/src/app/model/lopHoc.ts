import {GiangVien} from 'src/app/model/giangvien'
import { monHoc } from './monHoc';
export class lopHoc{
    maLop:String;
    tenLop:String;
    giangvien: GiangVien;
    maMonHoc:monHoc;
    isAlive: boolean;
}