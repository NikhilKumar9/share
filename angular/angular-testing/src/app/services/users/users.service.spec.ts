import { TestBed } from '@angular/core/testing';

import { UsersService } from './users.service';
import { of } from 'rxjs';

describe('UsersService', () => {
  let usersService: UsersService;
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [UsersService]
    });
    usersService = TestBed.get(UsersService);
  });

  it('should be created', () => {

    expect(usersService).toBeTruthy();
  });

  it('should return a collection of users', () => {
    const userResponse = [
      {
        id: '1',
        name: 'Jane',
        role: 'Designer',
        pokemon: 'Blastoise'
      },
      {
        id: '2',
        name: 'Bob',
        role: 'Developer',
        pokemon: 'Charizard'
      }
    ];
    let response;
    spyOn(usersService, 'all').and.returnValue(of(userResponse));

    usersService.all().subscribe(res => {
      response = res;
    });

    expect(response).toEqual(userResponse);
  });
});

