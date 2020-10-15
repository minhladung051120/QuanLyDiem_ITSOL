import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SinhvienLichhocComponent } from './sinhvien-lichhoc.component';

describe('SinhvienLichhocComponent', () => {
  let component: SinhvienLichhocComponent;
  let fixture: ComponentFixture<SinhvienLichhocComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SinhvienLichhocComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SinhvienLichhocComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
