import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EditTaikhoanComponent } from './edit-taikhoan.component';

describe('EditTaikhoanComponent', () => {
  let component: EditTaikhoanComponent;
  let fixture: ComponentFixture<EditTaikhoanComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EditTaikhoanComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EditTaikhoanComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
