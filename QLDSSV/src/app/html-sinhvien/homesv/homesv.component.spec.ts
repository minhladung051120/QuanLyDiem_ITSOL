import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { HomesvComponent } from './homesv.component';

describe('HomesvComponent', () => {
  let component: HomesvComponent;
  let fixture: ComponentFixture<HomesvComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ HomesvComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(HomesvComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
