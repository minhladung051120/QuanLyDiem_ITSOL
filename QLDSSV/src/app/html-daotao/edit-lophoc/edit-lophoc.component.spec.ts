import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EditLophocComponent } from './edit-lophoc.component';

describe('EditLophocComponent', () => {
  let component: EditLophocComponent;
  let fixture: ComponentFixture<EditLophocComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EditLophocComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EditLophocComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
