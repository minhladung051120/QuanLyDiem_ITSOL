import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GiangvienLophocComponent } from './giangvien-lophoc.component';

describe('GiangvienLophocComponent', () => {
  let component: GiangvienLophocComponent;
  let fixture: ComponentFixture<GiangvienLophocComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GiangvienLophocComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GiangvienLophocComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
