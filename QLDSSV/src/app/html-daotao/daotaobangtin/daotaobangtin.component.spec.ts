import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DaotaobangtinComponent } from './daotaobangtin.component';

describe('DaotaobangtinComponent', () => {
  let component: DaotaobangtinComponent;
  let fixture: ComponentFixture<DaotaobangtinComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DaotaobangtinComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DaotaobangtinComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
