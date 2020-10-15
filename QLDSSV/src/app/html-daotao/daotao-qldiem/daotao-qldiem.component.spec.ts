import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DaotaoQldiemComponent } from './daotao-qldiem.component';

describe('DaotaoQldiemComponent', () => {
  let component: DaotaoQldiemComponent;
  let fixture: ComponentFixture<DaotaoQldiemComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DaotaoQldiemComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DaotaoQldiemComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
