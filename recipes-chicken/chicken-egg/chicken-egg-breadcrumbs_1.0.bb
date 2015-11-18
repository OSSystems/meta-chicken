SECTION = "devel/chicken"
DESCRIPTION = "Breadcrumbs for web pages"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://breadcrumbs.meta;md5=b2d8364f39ff96a7942c27eb3b273066"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/breadcrumbs/breadcrumbs-${PV}.tar.gz"

SRC_URI[md5sum] = "fbbdfdf6ab583e15b45a4644a5a284ec"
SRC_URI[sha256sum] = "b8cb4f1137d79b427059edab134038300328b4d573725ec80e3d8e2fa56bc031"

S = "${WORKDIR}/breadcrumbs-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
