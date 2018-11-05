import java.io.Serializable;
import java.util.List;

// 李四删掉了一堆没用的注释 2018-11-05 13:10:20
public class Module implements Serializable {

    private static final long serialVersionUID = 2901703856123441317L;

    private Long id;// 主键
    private String moduleCode;// 模块编号
    private String moduleName;// 模块名称
    private String moduleUrl;// 模块URL
    private String moduleType;// 模块类型
    private Long navigationId;// 导航id
    private String descr;// 备注

    public Module() {
        super();
    }

    public Module(String code) {
        super();
    }

    public Module(String moduleCode, String moduleName) {
        this.moduleCode = moduleCode;
        this.moduleName = moduleName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModuleCode() {
        return moduleCode;
    }

    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getModuleUrl() {
        return moduleUrl;
    }

    public void setModuleUrl(String moduleUrl) {
        this.moduleUrl = moduleUrl;
    }

    public String getModuleType() {
        return moduleType;
    }

    public void setModuleType(String moduleType) {
        this.moduleType = moduleType;
    }

    public Long getNavigationId() {
        return navigationId;
    }

    public void setNavigationId(Long navigationId) {
        this.navigationId = navigationId;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

}
