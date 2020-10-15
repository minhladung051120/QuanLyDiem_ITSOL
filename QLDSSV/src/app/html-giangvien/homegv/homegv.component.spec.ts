import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { HomegvComponent } from './homegv.component';

describe('HomegvComponent', () => {
  let component: HomegvComponent;
  let fixture: ComponentFixture<HomegvComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ HomegvComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(HomegvComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
