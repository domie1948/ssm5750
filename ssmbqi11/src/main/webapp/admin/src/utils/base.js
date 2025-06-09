const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmbqi11/",
            name: "ssmbqi11",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmbqi11/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "网上办公自动化系统"
        } 
    }
}
export default base
