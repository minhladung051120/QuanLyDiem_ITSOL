import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DaotaothemmonhocComponent } from './daotaothemmonhoc.component';

describe('DaotaothemmonhocComponent', () => {
  let component: DaotaothemmonhocComponent;
  let fixture: ComponentFixture<DaotaothemmonhocComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DaotaothemmonhocComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DaotaothemmonhocComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
