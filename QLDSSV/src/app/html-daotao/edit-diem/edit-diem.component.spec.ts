import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EditDiemComponent } from './edit-diem.component';

describe('EditDiemComponent', () => {
  let component: EditDiemComponent;
  let fixture: ComponentFixture<EditDiemComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EditDiemComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EditDiemComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
