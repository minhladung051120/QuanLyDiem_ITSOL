import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DaotaothemtksvComponent } from './daotaothemtksv.component';

describe('DaotaothemtksvComponent', () => {
  let component: DaotaothemtksvComponent;
  let fixture: ComponentFixture<DaotaothemtksvComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DaotaothemtksvComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DaotaothemtksvComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
