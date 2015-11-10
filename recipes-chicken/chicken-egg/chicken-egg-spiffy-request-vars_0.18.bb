SECTION = "devel/chicken"
DESCRIPTION = "Provides easy access to variables from HTTP requests"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://spiffy-request-vars.meta;md5=f08d3aac925b6ce75306cb4965c98689"
DEPENDS_append_class-cross = " chicken-egg-intarweb-cross chicken-egg-uri-common-cross chicken-egg-spiffy-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-intarweb-crosssdk chicken-egg-uri-common-crosssdk chicken-egg-spiffy-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-intarweb nativesdk-chicken-egg-uri-common nativesdk-chicken-egg-spiffy chicken-egg-intarweb-crosssdk chicken-egg-uri-common-crosssdk chicken-egg-spiffy-crosssdk"
DEPENDS = " chicken-egg-intarweb chicken-egg-uri-common chicken-egg-spiffy chicken-egg-intarweb-cross chicken-egg-uri-common-cross chicken-egg-spiffy-cross"
RDEPENDS_${PN} = " chicken-egg-intarweb chicken-egg-uri-common chicken-egg-spiffy"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/spiffy-request-vars/spiffy-request-vars-${PV}.tar.gz"

SRC_URI[md5sum] = "c75a0eef7a3fe9a55513c059120c7758"
SRC_URI[sha256sum] = "22a646c7e822879f9dbd0aed805ae44b619ba94a2ace460c94092858edd09e1d"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
