package co.istad.springapi.api.accounttype;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountTypeServiceImpl implements AccountTypeService{

    private final AccountTypeMapper accountTypeMapper;

    @Override
    public List<AccountTypeDto> findAll() {
        List<AccountType> accountTypes = accountTypeMapper.select();
        List<AccountTypeDto> accountTypeDtoList = accountTypes.stream()
                .map(accountType -> new AccountTypeDto(accountType.getName())).toList();
        return accountTypeDtoList;
    }
}
