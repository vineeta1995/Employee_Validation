import java.util.Map;

public interface User
{
    void validate(int id, String pin, Map<Integer,UserModel> um);
}
