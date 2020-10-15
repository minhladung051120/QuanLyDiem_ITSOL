import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GiangvienBannerComponent } from './giangvien-banner.component';

describe('GiangvienBannerComponent', () => {
  let component: GiangvienBannerComponent;
  let fixture: ComponentFixture<GiangvienBannerComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GiangvienBannerComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GiangvienBannerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
