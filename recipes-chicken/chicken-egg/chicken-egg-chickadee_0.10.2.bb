SECTION = "devel/chicken"
DESCRIPTION = "chicken-doc web server"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://chickadee.meta;md5=f9412619e4353d9003b13d3aa6ed7b50"
DEPENDS_append_class-cross = " chicken-egg-matchable-cross chicken-egg-uri-common-cross chicken-egg-intarweb-cross chicken-egg-spiffy-cross chicken-egg-spiffy-request-vars-cross chicken-egg-chicken-doc-cross chicken-egg-sxml-transforms-cross chicken-egg-uri-generic-cross chicken-egg-chicken-doc-admin-cross chicken-egg-chicken-doc-html-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-matchable-crosssdk chicken-egg-uri-common-crosssdk chicken-egg-intarweb-crosssdk chicken-egg-spiffy-crosssdk chicken-egg-spiffy-request-vars-crosssdk chicken-egg-chicken-doc-crosssdk chicken-egg-sxml-transforms-crosssdk chicken-egg-uri-generic-crosssdk chicken-egg-chicken-doc-admin-crosssdk chicken-egg-chicken-doc-html-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-matchable nativesdk-chicken-egg-uri-common nativesdk-chicken-egg-intarweb nativesdk-chicken-egg-spiffy nativesdk-chicken-egg-spiffy-request-vars nativesdk-chicken-egg-chicken-doc nativesdk-chicken-egg-sxml-transforms nativesdk-chicken-egg-uri-generic nativesdk-chicken-egg-chicken-doc-admin nativesdk-chicken-egg-chicken-doc-html chicken-egg-matchable-crosssdk chicken-egg-uri-common-crosssdk chicken-egg-intarweb-crosssdk chicken-egg-spiffy-crosssdk chicken-egg-spiffy-request-vars-crosssdk chicken-egg-chicken-doc-crosssdk chicken-egg-sxml-transforms-crosssdk chicken-egg-uri-generic-crosssdk chicken-egg-chicken-doc-admin-crosssdk chicken-egg-chicken-doc-html-crosssdk"
DEPENDS = " chicken-egg-matchable chicken-egg-uri-common chicken-egg-intarweb chicken-egg-spiffy chicken-egg-spiffy-request-vars chicken-egg-chicken-doc chicken-egg-sxml-transforms chicken-egg-uri-generic chicken-egg-chicken-doc-admin chicken-egg-chicken-doc-html chicken-egg-matchable-cross chicken-egg-uri-common-cross chicken-egg-intarweb-cross chicken-egg-spiffy-cross chicken-egg-spiffy-request-vars-cross chicken-egg-chicken-doc-cross chicken-egg-sxml-transforms-cross chicken-egg-uri-generic-cross chicken-egg-chicken-doc-admin-cross chicken-egg-chicken-doc-html-cross chicken-egg-chickadee-cross"
RDEPENDS_${PN} = " chicken-egg-matchable chicken-egg-uri-common chicken-egg-intarweb chicken-egg-spiffy chicken-egg-spiffy-request-vars chicken-egg-chicken-doc chicken-egg-sxml-transforms chicken-egg-uri-generic chicken-egg-chicken-doc-admin chicken-egg-chicken-doc-html"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/chickadee/chickadee-${PV}.tar.gz"

SRC_URI[md5sum] = "afe80be4a6a614ec199177909d4b575d"
SRC_URI[sha256sum] = "15e3d89008d5161d59e1824f3bb46711218f50ea2b5a63dbcf5ea6082c713f56"

S = "${WORKDIR}/chickadee-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
