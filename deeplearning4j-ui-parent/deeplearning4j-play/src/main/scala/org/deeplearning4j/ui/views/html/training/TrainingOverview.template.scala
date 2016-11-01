
package org.deeplearning4j.ui.views.html.training

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object TrainingOverview_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class TrainingOverview extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[org.deeplearning4j.ui.api.I18N,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(i18n: org.deeplearning4j.ui.api.I18N):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.40*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>

        <meta charset="utf-8">
        <title>DL4J Training UI</title>
            <!-- Start Mobile Specific -->
        <meta name="viewport" content="width=device-width, initial-scale=1">
            <!-- End Mobile Specific -->

        <link id="bootstrap-style" href="/assets/css/bootstrap.min.css" rel="stylesheet">
        <link href="/assets/css/bootstrap-responsive.min.css" rel="stylesheet">
        <link id="base-style" href="/assets/css/style.css" rel="stylesheet">
        <link id="base-style-responsive" href="/assets/css/style-responsive.css" rel="stylesheet">
        <link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800&subset=latin,cyrillic-ext,latin-ext' rel='stylesheet' type='text/css'>
        <link rel="shortcut icon" href="/assets/img/favicon.ico">

            <!-- The HTML5 shim, for IE6-8 support of HTML5 elements -->
            <!--[if lt IE 9]>
	  	<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
		<link id="ie-style" href="/assets/css/ie.css" rel="stylesheet">
	<![endif]-->

            <!--[if IE 9]>
		<link id="ie9style" href="/assets/css/ie9.css" rel="stylesheet"/>
	<![endif]-->

    </head>

    <body>
            <!-- Start Header -->
        <div class="navbar">
            <div class="navbar-inner">
                <div class="container-fluid">
                    <a class="btn btn-navbar" data-toggle="collapse" data-target=".top-nav.nav-collapse,.sidebar-nav.nav-collapse">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </a>
                    <a class="brand" href="#"><span>DL4J Training UI</span></a>
                </div>
            </div>
        </div>
            <!-- End Header -->

        <div class="container-fluid-full">
            <div class="row-fluid">

                    <!-- Start Main Menu -->
                <div id="sidebar-left" class="span2">
                    <div class="nav-collapse sidebar-nav">
                        <ul class="nav nav-tabs nav-stacked main-menu">
                            <li class="active"><a href="javascript:void(0);"><i class="icon-bar-chart"></i><span class="hidden-tablet">Overview</span></a></li>
                            <li><a href="model"><i class="icon-tasks"></i><span class="hidden-tablet">Model</span></a></li>
                            <li><a href="system"><i class="icon-dashboard"></i><span class="hidden-tablet">System</span></a></li>
                            <li><a href="help"><i class="icon-star"></i><span class="hidden-tablet">User Guide</span></a></li>
                            <li>
                                <a class="dropmenu" href="javascript:void(0);"><i class="icon-folder-close-alt"></i><span class="hidden-tablet"> Language</span></a>
                                <ul>
                                    <li><a class="submenu" href="javascript:void(0);"><i class="icon-file-alt"></i><span class="hidden-tablet"> English</span></a></li>
                                    <li><a class="submenu" href="javascript:void(0);"><i class="icon-file-alt"></i><span class="hidden-tablet"> Japanese</span></a></li>
                                    <li><a class="submenu" href="javascript:void(0);"><i class="icon-file-alt"></i><span class="hidden-tablet"> Chinese</span></a></li>
                                    <li><a class="submenu" href="javascript:void(0);"><i class="icon-file-alt"></i><span class="hidden-tablet"> Korean</span></a></li>
                                </ul>
                            </li>
                        </ul>
                    </div>
                </div>
                    <!-- End Main Menu -->

                <noscript>
                    <div class="alert alert-block span10">
                        <h4 class="alert-heading">Warning!</h4>
                        <p>You need to have <a href="http://en.wikipedia.org/wiki/JavaScript" target="_blank">
                            JavaScript</a> enabled to use this site.</p>
                    </div>
                </noscript>

                <!-- Start Score Chart-->
                <div id="content" class="span10">

                    <div class="row-fluid">

                        <div class="box span8">
                            <div class="box-header">
                                <h2><b>"""),_display_(/*87.41*/i18n/*87.45*/.getMessage("train.overview.chart.scoreTitle")),format.raw/*87.91*/("""</b></h2>
                            </div>
                            <div class="box-content">
                                <div id="scoreiterchart" class="center" style="height: 300px;" ></div>
                                <p id="hoverdata"><b>Score:</b> <span id="y">0</span>, <b>Iteration:</b> <span id="x">
                                    0</span></p>
                            </div>
                        </div>
                        <!-- End Score Chart-->
                        <!-- Start Model Table-->
                        <div class="box span4">
                            <div class="box-header">
                                <h2><b>"""),_display_(/*99.41*/i18n/*99.45*/.getMessage("train.overview.perftable.title")),format.raw/*99.90*/("""</b></h2>
                            </div>
                            <div class="box-content">
                                <table class="table table-bordered table-striped table-condensed">
                                    <tr>
                                        <td>Model Type</td>
                                        <td id="modelType">Loading...</td>
                                    </tr>
                                    <tr>
                                        <td>nLayers</td>
                                        <td id="nLayers">Loading...</td>
                                    </tr>
                                    <tr>
                                        <td>nParams</td>
                                        <td id="nParams">Loading...</td>
                                    </tr>
                                    <tr>
                                        <td>Start Time</td>
                                        <td id="startTime">Loading...</td>
                                    </tr>
                                    <tr>
                                        <td>Total Run Time</td>
                                        <td id="totalRuntime">Loading...</td>
                                    </tr>
                                    <tr>
                                        <td>Last Update</td>
                                        <td id="lastUpdate">Loading...</td>
                                    </tr>
                                    <tr>
                                        <td>Total Param Updates</td>
                                        <td id="totalParamUpdates">Loading...</td>
                                    </tr>
                                    <tr>
                                        <td>Updates Per Second</td>
                                        <td id="updatesPerSec">Loading...</td>
                                    </tr>
                                    <tr>
                                        <td>Examples Per Second</td>
                                        <td id="examplesPerSec">Loading...</td>
                                    </tr>
                                </table>
                            </div>
                        </div>
                        <!--End Model Table -->
                    </div>


                    <div class="row-fluid">
                        <!--Start Ratio Table -->
                        <div class="box span6">
                            <div class="box-header">
                                <h2><b>Ratio of Updates to Parameters: All Layers</b></h2>
                            </div>
                            <div class="box-content">
                                <div id="sincos"  class="center" style="height:345px;" ></div>
                                <p id="hoverdata"><b>Score:</b> <span id="y">0</span>, <b>Iteration:</b> <span id="x">0</span></p>
                            </div>
                        </div>
                        <!--End Ratio Table -->
                        <!--Start Variance Table -->
                        <div class="box span6">
                            <div class="box-header">
                                <h2><b>Variances</b></h2>
                            </div>
                            <div class="box-content">
                                <p class="stackControls center">
                                    <input class="btn" type="button" value="Activations">
                                    <input class="btn" type="button" value="Gradients">
                                    <input class="btn" type="button" value="Updates">
                                </p>
                                <div id="sincos"  class="center" style="height:300px;" ></div>
                                <p id="hoverdata"><b>Score:</b> <span id="y">0</span>, <b>Iteration:</b> <span id="x">0</span></p>
                            </div>
                        </div>
                        <!-- End Variance Table -->
                    </div>

                </div><!-- End Content Span10-->
            </div><!--End Row Fluid-->

            <!-- Start JavaScript-->
            <script src="/assets/js/jquery-1.9.1.min.js"></script>
            <script src="/assets/js/jquery-migrate-1.0.0.min.js"></script>
            <script src="/assets/js/jquery-ui-1.10.0.custom.min.js"></script>
            <script src="/assets/js/jquery.ui.touch-punch.js"></script>
            <script src="/assets/js/modernizr.js"></script>
            <script src="/assets/js/bootstrap.min.js"></script>
            <script src="/assets/js/jquery.cookie.js"></script>
            <script src="/assets/js/fullcalendar.min.js"></script>
            <script src="/assets/js/jquery.dataTables.min.js"></script>
            <script src="/assets/js/excanvas.js"></script>
            <script src="/assets/js/jquery.flot.js"></script>
            <script src="/assets/js/jquery.flot.pie.js"></script>
            <script src="/assets/js/jquery.flot.stack.js"></script>
            <script src="/assets/js/jquery.flot.resize.min.js"></script>
            <script src="/assets/js/jquery.chosen.min.js"></script>
            <script src="/assets/js/jquery.uniform.min.js"></script>
            <script src="/assets/js/jquery.cleditor.min.js"></script>
            <script src="/assets/js/jquery.noty.js"></script>
            <script src="/assets/js/jquery.elfinder.min.js"></script>
            <script src="/assets/js/jquery.raty.min.js"></script>
            <script src="/assets/js/jquery.iphone.toggle.js"></script>
            <script src="/assets/js/jquery.uploadify-3.1.min.js"></script>
            <script src="/assets/js/jquery.gritter.min.js"></script>
            <script src="/assets/js/jquery.imagesloaded.js"></script>
            <script src="/assets/js/jquery.masonry.min.js"></script>
            <script src="/assets/js/jquery.knob.modified.js"></script>
            <script src="/assets/js/jquery.sparkline.min.js"></script>
            <script src="/assets/js/counter.js"></script>
            <script src="/assets/js/retina.js"></script>
            <script src="/assets/js/train/overview.js"></script>    <!-- Charts and tables are generated here! -->

            <!-- Execute once on page load -->
            <script>
                    $(document).ready(function()"""),format.raw/*213.49*/("""{"""),format.raw/*213.50*/("""
                        """),format.raw/*214.25*/("""renderOverviewPage();
                    """),format.raw/*215.21*/("""}"""),format.raw/*215.22*/(""");
            </script>

            <!-- Execute periodically (every 2 sec) -->
            <script>
                    setInterval(function()"""),format.raw/*220.43*/("""{"""),format.raw/*220.44*/("""
                        """),format.raw/*221.25*/("""renderOverviewPage();
                    """),format.raw/*222.21*/("""}"""),format.raw/*222.22*/(""", 2000);
            </script>
            <!-- End JavaScript-->

    </body>
</html>
"""))
      }
    }
  }

  def render(i18n:org.deeplearning4j.ui.api.I18N): play.twirl.api.HtmlFormat.Appendable = apply(i18n)

  def f:((org.deeplearning4j.ui.api.I18N) => play.twirl.api.HtmlFormat.Appendable) = (i18n) => apply(i18n)

  def ref: this.type = this

}


}

/**/
object TrainingOverview extends TrainingOverview_Scope0.TrainingOverview
              /*
                  -- GENERATED --
                  DATE: Tue Nov 01 19:42:26 AEDT 2016
                  SOURCE: C:/DL4J/Git/deeplearning4j/deeplearning4j-ui-parent/deeplearning4j-play/src/main/views/org/deeplearning4j/ui/views/training/TrainingOverview.scala.html
                  HASH: fee46d383baa81c4d64d06fedb3f5275e1c3c553
                  MATRIX: 604->1|737->39|765->41|5438->4687|5451->4691|5518->4737|6232->5424|6245->5428|6311->5473|12915->12048|12945->12049|13000->12075|13072->12118|13102->12119|13281->12269|13311->12270|13366->12296|13438->12339|13468->12340
                  LINES: 20->1|25->1|26->2|111->87|111->87|111->87|123->99|123->99|123->99|237->213|237->213|238->214|239->215|239->215|244->220|244->220|245->221|246->222|246->222
                  -- GENERATED --
              */
          