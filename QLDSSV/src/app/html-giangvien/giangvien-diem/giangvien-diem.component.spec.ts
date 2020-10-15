import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GiangvienDiemComponent } from './giangvien-diem.component';

describe('GiangvienDiemComponent', () => {
  let component: GiangvienDiemComponent;
  let fixture: ComponentFixture<GiangvienDiemComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GiangvienDiemComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GiangvienDiemComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
