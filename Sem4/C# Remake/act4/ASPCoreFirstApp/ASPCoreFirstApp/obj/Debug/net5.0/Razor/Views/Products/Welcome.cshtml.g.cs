#pragma checksum "C:\Users\spart\Documents\GitHub\arsonull.github.io\Sem4\C# Remake\act4\ASPCoreFirstApp\ASPCoreFirstApp\Views\Products\Welcome.cshtml" "{ff1816ec-aa5e-4d10-87f7-6f4963833460}" "c353754c3287f32995b43973eedd7100fbbe01c2"
// <auto-generated/>
#pragma warning disable 1591
[assembly: global::Microsoft.AspNetCore.Razor.Hosting.RazorCompiledItemAttribute(typeof(AspNetCore.Views_Products_Welcome), @"mvc.1.0.view", @"/Views/Products/Welcome.cshtml")]
namespace AspNetCore
{
    #line hidden
    using System;
    using System.Collections.Generic;
    using System.Linq;
    using System.Threading.Tasks;
    using Microsoft.AspNetCore.Mvc;
    using Microsoft.AspNetCore.Mvc.Rendering;
    using Microsoft.AspNetCore.Mvc.ViewFeatures;
#nullable restore
#line 1 "C:\Users\spart\Documents\GitHub\arsonull.github.io\Sem4\C# Remake\act4\ASPCoreFirstApp\ASPCoreFirstApp\Views\_ViewImports.cshtml"
using ASPCoreFirstApp;

#line default
#line hidden
#nullable disable
#nullable restore
#line 2 "C:\Users\spart\Documents\GitHub\arsonull.github.io\Sem4\C# Remake\act4\ASPCoreFirstApp\ASPCoreFirstApp\Views\_ViewImports.cshtml"
using ASPCoreFirstApp.Models;

#line default
#line hidden
#nullable disable
    [global::Microsoft.AspNetCore.Razor.Hosting.RazorSourceChecksumAttribute(@"SHA1", @"c353754c3287f32995b43973eedd7100fbbe01c2", @"/Views/Products/Welcome.cshtml")]
    [global::Microsoft.AspNetCore.Razor.Hosting.RazorSourceChecksumAttribute(@"SHA1", @"0b2b2fd52782326d29737e320991a6472bcb6832", @"/Views/_ViewImports.cshtml")]
    public class Views_Products_Welcome : global::Microsoft.AspNetCore.Mvc.Razor.RazorPage<dynamic>
    {
        #pragma warning disable 1998
        public async override global::System.Threading.Tasks.Task ExecuteAsync()
        {
            WriteLiteral("<h2>Welcome ");
#nullable restore
#line 1 "C:\Users\spart\Documents\GitHub\arsonull.github.io\Sem4\C# Remake\act4\ASPCoreFirstApp\ASPCoreFirstApp\Views\Products\Welcome.cshtml"
       Write(ViewBag.name);

#line default
#line hidden
#nullable disable
            WriteLiteral("</h2>\r\n<p>Your number is ");
#nullable restore
#line 2 "C:\Users\spart\Documents\GitHub\arsonull.github.io\Sem4\C# Remake\act4\ASPCoreFirstApp\ASPCoreFirstApp\Views\Products\Welcome.cshtml"
             Write(ViewBag.num);

#line default
#line hidden
#nullable disable
            WriteLiteral("</p>");
        }
        #pragma warning restore 1998
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.ViewFeatures.IModelExpressionProvider ModelExpressionProvider { get; private set; }
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.IUrlHelper Url { get; private set; }
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.IViewComponentHelper Component { get; private set; }
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.Rendering.IJsonHelper Json { get; private set; }
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.Rendering.IHtmlHelper<dynamic> Html { get; private set; }
    }
}
#pragma warning restore 1591