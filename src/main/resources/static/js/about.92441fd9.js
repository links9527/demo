(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["about"],{"0238":function(t,e,n){"use strict";n.r(e);var c=n("7a23");const d=t=>(Object(c["t"])("data-v-24cdac0c"),t=t(),Object(c["r"])(),t),l={align:"center"},u=d(()=>Object(c["f"])("tr",null,[Object(c["f"])("th",{style:{width:"120px"}},"行数"),Object(c["f"])("th",{style:{width:"120px"}},"Id"),Object(c["f"])("th",{style:{width:"120px"}},"名前"),Object(c["f"])("th",{style:{width:"150px"}},"住所"),Object(c["f"])("th",{style:{width:"50px"}},"年級"),Object(c["f"])("th",{style:{width:"50px"}},"班級"),Object(c["f"])("th",{style:{width:"50px"}}),Object(c["f"])("th",{style:{width:"50px"}})],-1)),s=["onClick"],a=["onClick"];function b(t,e,n,d,b,o){return Object(c["q"])(),Object(c["e"])(c["a"],null,[Object(c["f"])("div",null,[Object(c["f"])("button",{onClick:e[0]||(e[0]=t=>o.insertStudent())},"新規")]),Object(c["f"])("table",l,[u,(Object(c["q"])(!0),Object(c["e"])(c["a"],null,Object(c["w"])(b.studentList,(t,e)=>(Object(c["q"])(),Object(c["e"])("tr",{key:e},[Object(c["f"])("td",null,Object(c["z"])(e+1),1),Object(c["f"])("td",null,Object(c["z"])(t.sfid),1),Object(c["f"])("td",null,Object(c["z"])(t.name+" "+t.name2),1),Object(c["f"])("td",null,Object(c["z"])(t.address),1),Object(c["f"])("td",null,Object(c["z"])(t.education),1),Object(c["f"])("td",null,Object(c["z"])(t.cls),1),Object(c["f"])("td",null,[Object(c["f"])("button",{onClick:t=>o.editStudent(e)},"編集",8,s)]),Object(c["f"])("td",null,[Object(c["f"])("button",{onClick:t=>o.deleteStudent(e)},"削除",8,a)])]))),128))])],64)}var o=n("6c02");Object(c["l"])("axios");var i={name:"StudentList",components:{},data(){return{studentList:[]}},setup(){const t=Object(o["d"])();return{router:t}},computed:{},watch:{},methods:{insertStudent(){this.router.push("/edit/none")},editStudent(t){this.router.push({name:"edit",params:{id:this.studentList[t].id}})},deleteStudent(t){this.axios.delete("http://localhost:8888/student/"+this.studentList[t].id).then(()=>{this.studentList.splice(t,1)})}},created(){this.axios.get("http://localhost:8888/student").then(t=>{this.studentList=t.data})},mounted(){},beforeCreate(){},beforeMount(){},beforeUpdate(){},updated(){},unmounted(){},activated(){}},j=(n("3120"),n("d959")),O=n.n(j);const r=O()(i,[["render",b],["__scopeId","data-v-24cdac0c"]]);e["default"]=r},3120:function(t,e,n){"use strict";n("cb8b")},"437e":function(t,e,n){},b4f9:function(t,e,n){"use strict";n("437e")},cb8b:function(t,e,n){},f820:function(t,e,n){"use strict";n.r(e);var c=n("7a23");const d={class:"about"},l=Object(c["f"])("h1",null,"Student List",-1);function u(t,e,n,u,s,a){const b=Object(c["x"])("StudentList");return Object(c["q"])(),Object(c["e"])("div",d,[l,Object(c["h"])(b)])}var s=n("0238"),a={name:"Home",components:{StudentList:s["default"]}},b=n("d959"),o=n.n(b);const i=o()(a,[["render",u]]);e["default"]=i},fd23:function(t,e,n){"use strict";n.r(e);var c=n("7a23");const d=t=>(Object(c["t"])("data-v-77d1b50a"),t=t(),Object(c["r"])(),t),l={key:0},u={key:1},s={align:"center"},a=d(()=>Object(c["f"])("td",{style:{width:"50px"}},[Object(c["f"])("label",null,"姓 ")],-1)),b={style:{width:"150px"}},o=d(()=>Object(c["f"])("td",{style:{width:"50px"}},[Object(c["f"])("label",null,"名 ")],-1)),i={style:{width:"150px"}},j=d(()=>Object(c["f"])("td",null,[Object(c["f"])("label",null,"住所")],-1)),O=d(()=>Object(c["f"])("td",null,[Object(c["f"])("label",null,"年級")],-1)),r=d(()=>Object(c["f"])("br",null,null,-1)),f=d(()=>Object(c["f"])("td",null,[Object(c["f"])("label",null,"班級")],-1)),p=d(()=>Object(c["f"])("td",null,null,-1)),h=d(()=>Object(c["f"])("td",null,null,-1)),m={style:{margin:"0 150px"}};function x(t,e,n,d,x,y){return Object(c["q"])(),Object(c["e"])(c["a"],null,[Object(c["f"])("div",null,["none"==d.route.params.id?(Object(c["q"])(),Object(c["e"])("h1",l,"新規学生")):(Object(c["q"])(),Object(c["e"])("h1",u,"編集学生")),Object(c["f"])("table",s,[Object(c["f"])("tr",null,[a,Object(c["f"])("td",b,[Object(c["D"])(Object(c["f"])("input",{type:"text",name:"fname","onUpdate:modelValue":e[0]||(e[0]=t=>x.student.name=t)},null,512),[[c["B"],x.student.name]])]),o,Object(c["f"])("td",i,[Object(c["D"])(Object(c["f"])("input",{type:"text",name:"lname2","onUpdate:modelValue":e[1]||(e[1]=t=>x.student.name2=t)},null,512),[[c["B"],x.student.name2]])])]),Object(c["f"])("tr",null,[j,Object(c["f"])("td",null,[Object(c["D"])(Object(c["f"])("input",{type:"text",name:"address","onUpdate:modelValue":e[2]||(e[2]=t=>x.student.address=t)},null,512),[[c["B"],x.student.address]])]),O,Object(c["f"])("td",null,[Object(c["D"])(Object(c["f"])("input",{type:"text",name:"grade","onUpdate:modelValue":e[3]||(e[3]=t=>x.student.education=t)},null,512),[[c["B"],x.student.education]])]),r]),Object(c["f"])("tr",null,[f,Object(c["f"])("td",null,[Object(c["D"])(Object(c["f"])("input",{type:"text",name:"class","onUpdate:modelValue":e[4]||(e[4]=t=>x.student.cls=t)},null,512),[[c["B"],x.student.cls]])]),p,h])])]),Object(c["f"])("div",m,[Object(c["f"])("button",{type:"button",onClick:e[5]||(e[5]=(...t)=>y.saveStudent&&y.saveStudent(...t))},"保存"),Object(c["f"])("button",{type:"button",onClick:e[6]||(e[6]=(...t)=>y.cancel&&y.cancel(...t))},"キャンセル")])],64)}var y=n("6c02");Object(c["l"])("axios");var v={name:"EditStudent",components:{},data(){const t=Object(c["u"])({name:"",name2:"",cls:"",education:"",id:"",sfid:"",address:""});return{student:t}},computed:{},watch:{},methods:{saveStudent(){this.student.id?this.axios.put("http://localhost:8888/student",this.student).then(t=>{this.cancel()}):this.axios.post("http://localhost:8888/student",this.student).then(t=>{this.cancel()})},cancel(){this.router.push("/")}},setup(){const{proxy:t}=Object(c["j"])(),e=Object(y["c"])(),n=Object(y["d"])();return"none"!=e.params.id&&t.axios.get("http://localhost:8888/student/"+e.params.id).then(e=>{t.$data.student=e.data[0]}),{route:e,router:n,proxy:t}},created(){},mounted(){},beforeCreate(){},beforeMount(){},beforeUpdate(){},updated(){},unmounted(){},activated(){}},w=(n("b4f9"),n("d959")),S=n.n(w);const k=S()(v,[["render",x],["__scopeId","data-v-77d1b50a"]]);e["default"]=k}}]);
//# sourceMappingURL=about.92441fd9.js.map