SECTION = "devel/chicken"
DESCRIPTION = "Facilities for managing HTTP sessions"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://http-session.meta;md5=a3b1df0688d5748db2739bb2a61b2e0d"
DEPENDS_append_class-cross = " chicken-egg-simple-sha1-cross chicken-egg-spiffy-cross chicken-egg-intarweb-cross chicken-egg-uri-common-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-simple-sha1-crosssdk chicken-egg-spiffy-crosssdk chicken-egg-intarweb-crosssdk chicken-egg-uri-common-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-simple-sha1 nativesdk-chicken-egg-spiffy nativesdk-chicken-egg-intarweb nativesdk-chicken-egg-uri-common chicken-egg-simple-sha1-crosssdk chicken-egg-spiffy-crosssdk chicken-egg-intarweb-crosssdk chicken-egg-uri-common-crosssdk"
DEPENDS = " chicken-egg-simple-sha1 chicken-egg-spiffy chicken-egg-intarweb chicken-egg-uri-common chicken-egg-simple-sha1-cross chicken-egg-spiffy-cross chicken-egg-intarweb-cross chicken-egg-uri-common-cross"
RDEPENDS_${PN} = " chicken-egg-simple-sha1 chicken-egg-spiffy chicken-egg-intarweb chicken-egg-uri-common"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/http-session/http-session-${PV}.tar.gz"

SRC_URI[md5sum] = "b7c9a2d3f03f10fa2d77c7b9cb06c22f"
SRC_URI[sha256sum] = "6f67a23b38b136f8f34fd7269ef51541a904b79296facbffd9ade6ab920f950a"

S = "${WORKDIR}/http-session-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
