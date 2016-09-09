SECTION = "devel/chicken"
DESCRIPTION = "Port interface to syslog"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://syslog-port.meta;md5=2b73842c04ea46fc141357da96ca44f0"
DEPENDS_append_class-cross = " chicken-egg-module-declarations-cross chicken-egg-syslog-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-module-declarations-crosssdk chicken-egg-syslog-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-module-declarations nativesdk-chicken-egg-syslog chicken-egg-module-declarations-crosssdk chicken-egg-syslog-crosssdk"
DEPENDS = " chicken-egg-module-declarations chicken-egg-syslog chicken-egg-module-declarations-cross chicken-egg-syslog-cross"
RDEPENDS_${PN} = " chicken-egg-module-declarations chicken-egg-syslog"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/syslog-port/syslog-port-${PV}.tar.gz"

SRC_URI[md5sum] = "df1fc4d2a9900d409b708d7345ebd856"
SRC_URI[sha256sum] = "75234a30546b5fe67b40b5482a8f579c51ad9eaebcded651ee8bdbacada705f7"

S = "${WORKDIR}/syslog-port-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
