SECTION = "devel/chicken"
DESCRIPTION = "Run SQLite queries asynchronously in pthreads.  Supports calling Scheme from SQLite's VFS to supply database block storage."
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://sqlite3pth.meta;md5=ae19199286a261d35e510f8ac3d0919a"
DEPENDS_append_class-cross = " chicken-egg-pthreads-cross chicken-egg-srfi-34-cross chicken-egg-llrb-tree-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-pthreads-crosssdk chicken-egg-srfi-34-crosssdk chicken-egg-llrb-tree-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-pthreads nativesdk-chicken-egg-srfi-34 nativesdk-chicken-egg-llrb-tree chicken-egg-pthreads-crosssdk chicken-egg-srfi-34-crosssdk chicken-egg-llrb-tree-crosssdk"
DEPENDS = " chicken-egg-pthreads chicken-egg-srfi-34 chicken-egg-llrb-tree chicken-egg-pthreads-cross chicken-egg-srfi-34-cross chicken-egg-llrb-tree-cross"
RDEPENDS_${PN} = " chicken-egg-pthreads chicken-egg-srfi-34 chicken-egg-llrb-tree"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/sqlite3pth/sqlite3pth-${PV}.tar.gz"

SRC_URI[md5sum] = "28fa4b360cb7f266e80dade404d25eff"
SRC_URI[sha256sum] = "01db5f46cb6b652096d69dff50b76aac656cecfe02b44ac59fb2251dd65db311"

S = "${WORKDIR}/sqlite3pth-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
