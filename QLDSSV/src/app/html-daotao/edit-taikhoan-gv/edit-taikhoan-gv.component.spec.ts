import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EditTaikhoanGVComponent } from './edit-taikhoan-gv.component';

describe('EditTaikhoanGVComponent', () => {
  let component: EditTaikhoanGVComponent;
  let fixture: ComponentFixture<EditTaikhoanGVComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EditTaikhoanGVComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EditTaikhoanGVComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
