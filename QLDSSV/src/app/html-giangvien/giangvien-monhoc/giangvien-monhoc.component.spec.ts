import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GiangvienMonhocComponent } from './giangvien-monhoc.component';

describe('GiangvienMonhocComponent', () => {
  let component: GiangvienMonhocComponent;
  let fixture: ComponentFixture<GiangvienMonhocComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GiangvienMonhocComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GiangvienMonhocComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
