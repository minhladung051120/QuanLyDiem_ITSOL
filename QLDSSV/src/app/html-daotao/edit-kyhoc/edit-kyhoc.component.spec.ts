import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EditKyhocComponent } from './edit-kyhoc.component';

describe('EditKyhocComponent', () => {
  let component: EditKyhocComponent;
  let fixture: ComponentFixture<EditKyhocComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EditKyhocComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EditKyhocComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
