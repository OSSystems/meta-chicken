SECTION = "devel/chicken"
DESCRIPTION = "Some trivial debugging macros"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://debug.meta;md5=46ddaf780f9d2a3392367b3b9cee822e"
DEPENDS_append_class-cross = " chicken-egg-hahn-cross chicken-egg-matchable-cross chicken-egg-setup-helper-cross chicken-egg-syslog-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-hahn-crosssdk chicken-egg-matchable-crosssdk chicken-egg-setup-helper-crosssdk chicken-egg-syslog-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-hahn nativesdk-chicken-egg-matchable nativesdk-chicken-egg-setup-helper nativesdk-chicken-egg-syslog chicken-egg-hahn-crosssdk chicken-egg-matchable-crosssdk chicken-egg-setup-helper-crosssdk chicken-egg-syslog-crosssdk"
DEPENDS = " chicken-egg-hahn chicken-egg-matchable chicken-egg-setup-helper chicken-egg-syslog chicken-egg-hahn-cross chicken-egg-matchable-cross chicken-egg-setup-helper-cross chicken-egg-syslog-cross"
RDEPENDS_${PN} = " chicken-egg-hahn chicken-egg-matchable chicken-egg-setup-helper chicken-egg-syslog"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/debug/debug-${PV}.tar.gz"

SRC_URI[md5sum] = "9a2f6ae58dc54f65a1e3f3bee77c1c59"
SRC_URI[sha256sum] = "1b87ae8323177a55a8ddec31928c0153310f14ad16da375fcb6808692633d19b"

S = "${WORKDIR}/debug-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
