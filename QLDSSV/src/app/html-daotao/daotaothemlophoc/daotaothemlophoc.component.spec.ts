import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DaotaothemlophocComponent } from './daotaothemlophoc.component';

describe('DaotaothemlophocComponent', () => {
  let component: DaotaothemlophocComponent;
  let fixture: ComponentFixture<DaotaothemlophocComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DaotaothemlophocComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DaotaothemlophocComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
