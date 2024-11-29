import java.util.ArrayList;

class App {
    public static void main(String[] args){
        MemberDTO dto = new MemberDTO(1L, "홍길동");
        
        MemberController c = new MemberController();
        c.insertMember(dto);
    }
}

class MemberDTO {
    // 멤버 필드
    private Long memId;
    private String memName;
    public MemberDTO(Long memId, String memName) {
        this.memId = memId;
        this.memName = memName;
    }
    public Long getMemId() {
        return this.memId;
    }

    public void setMemId(Long memId) {
        this.memId = memId;
    }

    public String getMemName() {
        return this.memName;
    }

    public void setMemName(String memName) {
        this.memName = memName;
    }
    @Override
    public String toString(){
        return "MemberDTO [memId=" +  memId + ", memName=" + memName + "]";
        // return super.toString();
    }
}

interface IMemberDAO {
    // 회원 등록
    public void insertMember(MemberDTO dto);
    // 회원 정보 삭제
    public void deleteMember(Long memId);

    // 회원 조회
    // 전체
    public ArrayList<MemberDTO> getAllMember();

    // 회원 수정
    public void updateMember(MemberDTO dto);
}

class MemberDAO implements IMemberDAO {
    
    @Override
    public void insertMember(MemberDTO dto) {
        // 컨트롤로에게 전달발은 값을 DB에 저장했다고 가정
        System.out.println("회원 등록 성공");
        System.out.println(dto);
    }

    @Override
    public void deleteMember(Long memId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteMember'");
    }

    @Override
    public ArrayList<MemberDTO> getAllMember() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllMember'");
    }

    @Override
    public void updateMember(MemberDTO dto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateMember'");
    }

}
class MemberController {
    MemberDAO dao = new MemberDAO();

    public void insertMember(MemberDTO dto){
        dao.insertMember(dto);
    }
}
/*
MVC패턴
Model : 데이터
    - DTO 클래스 : Data Transfer Object 데이터를 담아 전달 하는 용도
    - DAO 인터페이스/구현클래스 : DB에 접근하여 데이터 처리하는 용도
View : 뷰페이지
Controller : 요청 처리
 */
