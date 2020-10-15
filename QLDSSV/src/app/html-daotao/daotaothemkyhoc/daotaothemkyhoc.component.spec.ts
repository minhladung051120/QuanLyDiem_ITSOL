import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DaotaothemkyhocComponent } from './daotaothemkyhoc.component';

describe('DaotaothemkyhocComponent', () => {
  let component: DaotaothemkyhocComponent;
  let fixture: ComponentFixture<DaotaothemkyhocComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DaotaothemkyhocComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DaotaothemkyhocComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
