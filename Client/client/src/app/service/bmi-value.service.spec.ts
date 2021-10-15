import { TestBed } from '@angular/core/testing';

import { BmiValueService } from './bmi-value.service';

describe('BmiValueService', () => {
  let service: BmiValueService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(BmiValueService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
