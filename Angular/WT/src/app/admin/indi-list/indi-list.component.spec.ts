import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { IndiListComponent } from './indi-list.component';

describe('IndiListComponent', () => {
  let component: IndiListComponent;
  let fixture: ComponentFixture<IndiListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ IndiListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(IndiListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
