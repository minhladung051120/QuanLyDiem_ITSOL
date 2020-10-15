import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SinhvienBangdiemComponent } from './sinhvien-bangdiem.component';

describe('SinhvienBangdiemComponent', () => {
  let component: SinhvienBangdiemComponent;
  let fixture: ComponentFixture<SinhvienBangdiemComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SinhvienBangdiemComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SinhvienBangdiemComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
