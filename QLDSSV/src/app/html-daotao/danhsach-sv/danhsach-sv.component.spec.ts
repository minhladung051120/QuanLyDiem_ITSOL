import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DanhsachSVComponent } from './danhsach-sv.component';

describe('DanhsachSVComponent', () => {
  let component: DanhsachSVComponent;
  let fixture: ComponentFixture<DanhsachSVComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DanhsachSVComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DanhsachSVComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
