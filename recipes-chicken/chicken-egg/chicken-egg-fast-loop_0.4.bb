SECTION = "devel/chicken"
DESCRIPTION = "Fast extensible looping macros"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://fast-loop.meta;md5=9b450e75bd9bdae6d54f36e8ab468d6e"
DEPENDS_append_class-cross = " chicken-egg-matchable-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-matchable-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-matchable chicken-egg-matchable-crosssdk"
DEPENDS = " chicken-egg-matchable chicken-egg-matchable-cross"
RDEPENDS_${PN} = " chicken-egg-matchable"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/fast-loop/fast-loop-${PV}.tar.gz"

SRC_URI[md5sum] = "a356a3acbb4b1e59e12d2376f242a17f"
SRC_URI[sha256sum] = "58fd9e660919094f13bc7e199e61c79c44c41996d23eb8028a945f19668180b8"

S = "${WORKDIR}/fast-loop-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
