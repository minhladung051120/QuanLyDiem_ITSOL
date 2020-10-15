import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EditTaikhoanSVComponent } from './edit-taikhoan-sv.component';

describe('EditTaikhoanSVComponent', () => {
  let component: EditTaikhoanSVComponent;
  let fixture: ComponentFixture<EditTaikhoanSVComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EditTaikhoanSVComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EditTaikhoanSVComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
