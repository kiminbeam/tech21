package ex05;

import java.util.List;

public class Service {

    private final Repository repo;

    public Service(Repository repo) {
        this.repo = repo;
    }
    //has 코드 || 컴퍼지션

    public List<Integer> 목록보기() {
        return repo.findAll();
    }

    public int 상세보기() {
        return repo.findById();
    }
}
